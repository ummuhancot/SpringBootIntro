package com.tpe;

import com.tpe.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//tomcat uygulamanın icine gömülü olarak geliyor ve bu sayede uygulamayı
// çalıştırdımız anda serverimizi ayaga kaldırıyor.
//configrasyon ayarları otomatik olarak yapar.fotografta örnegi var
//db ayarlarını bizim özellik olarak vermemizgerekir.
//bean lerin üretilmesi icin component scan yapar.
///---------------------------------------------------------------------------
///componentscan bu classın içinde bulunduğu packegeda default olarak tarar
@SpringBootApplication
public class SpringBootIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntroApplication.class, args);
//		Student student=new Student();
//		student.getEmail();
//		student.setName(""); -->getter ve setteri denedik.
//		student.setid(); -->setteri denedik.kapandı cağırmadı

	}

}
