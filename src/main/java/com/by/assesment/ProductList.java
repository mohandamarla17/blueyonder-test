package com.by.assesment;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


@RestController
@RequestMapping("sortProducts")
public class ProductList {
	
	@JsonFormat(with = JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)
    @JsonProperty(value = "productList")
	List<Product> productList;
	
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	@PostMapping(consumes = "application/json", produces = "application/json")
	public List<Product>  sortProducts(@RequestBody List<Product> productList) {
		
		System.out.println("Hello");
		
		return productList;
	}
}
