package com.springboot.productcompany.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.productcompany.ProductInfo;
import com.springboot.productcompany.dao.ProductDao;

@RestController
@RequestMapping(value="/productInfo")
public class ProductController {
	
	@Autowired
	ProductDao pdao;
	
	private static Map<Integer,ProductInfo> productData = new HashMap<Integer,ProductInfo>();
	
	@RequestMapping(value="/productDetailRest",method=RequestMethod.GET)	
	public List<ProductInfo> showRestProduct(){
		
/*		ProductInfo pi=new ProductInfo();	
		pi.setProductName("CocaCola");
		pi.setProductPrice(85.00);	
		pdao.save(pi)*/;
		
		List<ProductInfo>productList=pdao.findAll();
		return productList;		
	}
	
	@RequestMapping(value="/productDetailView",method=RequestMethod.GET)
	public ModelAndView showViewProduct(ModelMap map){
		
		//ProductInfo pi=new ProductInfo();
		List<ProductInfo>list=pdao.findAll();
		map.put("prdList", list);
		return new ModelAndView("ProductView");
		
	}
	
	@RequestMapping(value="/productAdd",method=RequestMethod.POST)
	public @ResponseBody ProductInfo  addStudent(@RequestBody ProductInfo pi)
    {
	   productData.put(pi.getProductId(), pi);
	   pdao.save(pi);
       return pi;
    }
}
