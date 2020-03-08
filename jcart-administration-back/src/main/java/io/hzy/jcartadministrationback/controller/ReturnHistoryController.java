package io.hzy.jcartadministrationback.controller;

import io.hzy.jcartadministrationback.dto.in.ReturnHistoryCreateInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnhistory")
public class ReturnHistoryController {

    @Autowired
    private ReturnHistoryService returnHistoryService;

    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryController> getListByReturnId(@RequestParam Integer returnId){

        List<ReturnHistory> returnHistories = returnHistoryService.getListByReturnId(returnId);

        List<ReturnHistoryListOutDTO> returnHistoryListOutDTOS = returnHistories.stream().map(returnHistory -> {
            ReturnHistoryListOutDTO returnHistoryListOutDTO = new ReturnHistoryListOutDTO();
            returnHistoryListOutDTO.setReturnHistoryId(returnHistory.getReturnHistoryId());
            returnHistoryListOutDTO.setTimestamp(returnHistory.getTime().getTime());
            returnHistoryListOutDTO.setReturnStatus(returnHistory.getReturnStatus());
            returnHistoryListOutDTO.setComment(returnHistory.getComment());
            returnHistoryListOutDTO.setCustomerNotified(returnHistory.getCustomerNotified());
            return returnHistoryListOutDTO;
        }).collect(Collectors.toList());

        return returnHistoryListOutDTOS;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        ReturnHistory returnHistory = new ReturnHistory();
        returnHistory.setReturnId(returnHistoryCreateInDTO.getReturnId());
        returnHistory.setTime(new Date());
        returnHistory.setReturnStatus(returnHistoryCreateInDTO.getReturnStatus());
        returnHistory.setComment(returnHistoryCreateInDTO.getComment());
        Boolean customerNotified = returnHistoryCreateInDTO.getCustomerNotified();
        returnHistory.setCustomerNotified(customerNotified);
        Long returnHistoryId = returnHistoryService.create(returnHistory);

        if (customerNotified != null && customerNotified){
            //todo send notification to customer
        }

        return returnHistoryId;
    }
}
