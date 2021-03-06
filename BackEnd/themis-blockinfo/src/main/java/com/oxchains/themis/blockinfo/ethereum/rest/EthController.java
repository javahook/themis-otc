package com.oxchains.themis.blockinfo.ethereum.rest;

import com.oxchains.themis.blockinfo.ethereum.service.BlockInfoService;
import com.oxchains.themis.common.model.RestResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ccl
 * @time 2018-05-22 17:00
 * @name EthController
 * @desc:
 */
@RestController
@RequestMapping(value = "/eth")
public class EthController {

    @Resource
    private BlockInfoService blockInfoService;

    @GetMapping(value = "/block/search/{block}")
    public RestResp search(@PathVariable String block) {
        return blockInfoService.search(block);
    }

    @GetMapping(value = "/blockinfo/{pageNo}/{pageSize}")
    public RestResp getBlockInfo(@PathVariable Integer pageNo, @PathVariable Integer pageSize) {
        return blockInfoService.getEthBlockInfo(pageNo, pageSize);
    }

    @GetMapping(value = "/block/{block}")
    public RestResp getBlockInfo(@PathVariable String block) {
        return blockInfoService.getEthBlockInfo(block);
    }

    @GetMapping(value = "/address/{address}")
    public RestResp getBalance(@PathVariable String address) {
        return blockInfoService.getEthBalance(address);
    }

}
