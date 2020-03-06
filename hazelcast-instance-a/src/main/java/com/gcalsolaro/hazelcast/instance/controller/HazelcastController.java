package com.gcalsolaro.hazelcast.instance.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hazelcast.core.HazelcastInstance;

@RestController
@RequestMapping("/hazelcast")
public class HazelcastController {

	@Autowired
	private HazelcastInstance hazelcastInstance;

	@GetMapping(value = "/write-data")
	public String writeDataToHazelcast() {
		Map<String, String> hazelcastMap = hazelcastInstance.getMap("my-map");
		hazelcastMap.put("ciao", "bello");
		return "Data is stored.";
	}

	@GetMapping(value = "/read-data")
	public String readDataFromHazelcast() {
		Map<String, String> hazelcastMap = hazelcastInstance.getMap("my-map");
		return hazelcastMap.get("ciao");
	}

}
