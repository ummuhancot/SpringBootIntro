package com.tpe.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter//tüm fieldlar için getter oluşturur.@Getter//tüm fieldlar için getter metodunun tanımlanmasını sağlar.
@Setter//tüm fieldlar için setter oluşturur.@Setter//tüm fieldlar için setter metodunun tanımlanmasını sağlar.
@AllArgsConstructor//tüm fieldlar için parametreli constructor oluşturur.@AllArgsConstructor//tüm fieldları parametrede verildiği constructor metodlarını tanımlanmasını sağlar.
@NoArgsConstructor//tüm fieldlar için parametresiz constructor oluşturur.@NoArgsConstructor//tüm fieldları parametresiz yani default constructor metodlarını tanımlanmasını sağlar.
//@RequiredArgsConstructor//final olan fieldlar için parametreli constructor oluşturur.@RequiredArgsConstructor//final olan fieldları parametrede verildiği constructor metodlarını tanımlanmasını sağlar.
//final old icin constructor oluşturuldu. ve noAllArgsConstrucor kaldırıldı.
//objeyi constructor final olan zorunlu olan değerleri vereceğiz
//    public Student(String name, String lastname) {
//        this.name = name;
//        this.lastname = lastname;
//    }
@Entity

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)//sadece getter oluşturulur. setterlerine ulasamayız.
    private Long id;

    @NotBlank(message = "Name can not be blank")
    @Column(nullable = false)
    //final private String name;//final ile ismi uygulama boyunca değiştirilemez hale getirildi.
    @Size(min = 2,max = 50,message = "Name must be be 2 and 50") //burda en fazla alacagı karakter sayısını kullanıcıdan alırken belirttiğimiz aralıkta olmasını sağlar.
    private String name;

    @NotBlank(message = "Lastname can not be blank")
    @Column(nullable = false)
    //final private String lastname;//başlangıçta değer atanır ve değiştirilemez.
    private String lastname;

    @NotBlank(message = "place provide grade!")
    @Column(nullable = false)
    private Integer grade;


    @Email(message = "pleace provide valid email!")//aaa@bbb.ccc -->email formatında olmasını saglamak icin doğrulama
    //@Pattern((regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))//bu da email formatında olmasını saglamak icin doğrulama
    //regex ile format kontrolü yapılabilir. emaili daha ayrıntılı doğrulama yöntemi pattern ile yapılabilir.
    @Column(nullable = false,unique = true)
    private String email;

    @Setter(AccessLevel.NONE)//sadece getter oluşturulur. setterlerine ulasamayız.
    private LocalDateTime createDate=LocalDateTime.now();

    //getter - setter: anatas
    //constructor:

   /*       MANUEL OLARAK YAZMAYA GEREK YOK @RequiredArgsConstructor bunu bizim yerimize yapıyor.
   //final old icin constructor oluşturuldu. ve noAllArgsConstrucor kaldırıldı.
    //objeyi constructor final olan zorunlu olan değerleri vereceğiz
    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    */
}
