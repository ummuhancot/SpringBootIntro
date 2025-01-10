package com.tpe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //repuestler bu classtaki metodlarla eşleştirilecek ve responselar hazırlanacak.
///controller dan farkı objeleri json formatında dönüştürerek döner @Restcontroller .
//@ResponseBody : metodun dönüx değerini JSON formatında cevap olarak hazırlar kullanmaya gerek kalmaz.
// :obje<->jackson kütüphanesi saglar
@RequestMapping("/student") //https://localhost:8080/student... gelen tüm istekleri belirtmimş oluyorduk
public class StudentController {
}
