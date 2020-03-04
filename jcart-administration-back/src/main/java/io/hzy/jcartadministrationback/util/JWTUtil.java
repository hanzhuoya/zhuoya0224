package io.hzy.jcartadministrationback.util;

import com.sun.org.apache.xml.internal.security.algorithms.Algorithm;
import io.cjf.jcartstoreback.vo.CustomerLoginVO;
import io.hzy.jcartadministrationback.dto.out.CustomerLoginOutDTO;
import io.hzy.jcartadministrationback.po.Customer;
import io.hzy.jcartadministrationback.vo.AdministratorLoginVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${jwt.valid.duration}")
    private Long jwtValidDuration;

    @Value("${jwt.issuer}")
    private String issuer;

    private Algorithm algorithm;

    public JWTUtil(@Value("${jwt.HS256.secret}") String jwtHS256Secret) {
        logger.info("init jwt util");
       // algorithm = Algorithm.HMAC256(jwtHS256Secret);
    }

    public CustomerLoginOutDTO issueToken(Customer customer) {
        Date now = new Date();
        long nowTimestamp = now.getTime();
        long expireTimestamp = nowTimestamp + jwtValidDuration;
        Date expireTime = new Date(expireTimestamp);
        Integer customerId = customer.getCustomerId();
        String username = customer.getUsername();

        String token = JWTUtilT.create()
                .withIssuer(issuer)
                .withIssuedAt(now)
                .withSubject(username)
                .withClaim("customerId", customerId)
                .withExpiresAt(expireTime)
                .sign(algorithm);

        logger.info("jwt token: {}", token);
        logger.info("jwt expire date: {}", expireTimestamp);
        CustomerLoginOutDTO customerLoginOutDTO = new CustomerLoginOutDTO();
        customerLoginOutDTO.setToken(token);
        customerLoginOutDTO.setExpireTimestamp(expireTimestamp);

        return customerLoginOutDTO;
    }



   /* public AdministratorLoginVO verifyToken(String token) {
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer(issuer)
                .build();
        DecodedJWT jwt;
        jwt = verifier.verify(token);

        CustomerLoginVO customerLoginVO = new CustomerLoginVO();
        customerLoginVO.setCustomerId(jwt.getClaim("customerId").asInt());
        customerLoginVO.setUsername(jwt.getSubject());
        return customerLoginVO;
    }*/


//    public AdministratorLoginVO verifyToken(String token) {
//        JWTVerifier verifier = JWT.require(algorithm)
//                .withIssuer(issuer)
//                .build();
//        DecodedJWT jwt;
//        jwt = verifier.verify(token);
//
//        AdministratorLoginVO administratorLoginVO = new AdministratorLoginVO();
//        administratorLoginVO.setAdministratorId(jwt.getClaim("administratorId").asInt());
//        administratorLoginVO.setUsername(jwt.getSubject());
//        return administratorLoginVO;
//    }

}
