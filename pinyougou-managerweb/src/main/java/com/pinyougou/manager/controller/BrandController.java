package com.pinyougou.manager.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

@Controller
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("test")
	@ResponseBody
	public List<TbBrand> findAll(){
		return brandService.findAll();		
	}
	
}
