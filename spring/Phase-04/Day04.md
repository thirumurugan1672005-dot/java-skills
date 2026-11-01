# Consuming Rest Services 

* OpenFeign
* RestTemplate
* WebClient

# OpenFeign
* OpenFeign is the one of the depedency to call the rest services from another app
* Here it  avoids boiler-plate code
* @EnableFeignClient(basePackages='') able to scan all the sub packages mentioned
* @FeignClient marks as feign client interface to provide methods which are going to call from other app
* It will be called from controller part


# RestTemplate
* Here we need to mention restTemplate bean to register and use it to have methods to able to call the rest services from another app

# WebClient
* It is used for reactive app
* It is used somewhat like resTemplate
