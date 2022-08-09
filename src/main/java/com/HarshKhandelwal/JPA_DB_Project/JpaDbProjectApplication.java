package com.HarshKhandelwal.JPA_DB_Project;

import com.HarshKhandelwal.JPA_DB_Project.entity.StoreInformation;
import com.HarshKhandelwal.JPA_DB_Project.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JpaDbProjectApplication implements CommandLineRunner {

	@Autowired
	StoreInformationRepository storeInformationRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDbProjectApplication.class, args);
	}

	@Override
	public void run(String... args){
		StoreInformation storeInformation1 = new StoreInformation
				("Call of Duty", "Best Multiplayer and Battle royal game", "xxxxx");
		storeInformationRepository.save(storeInformation1);

		StoreInformation storeInformation2 = new StoreInformation
				("PubG", "Best Battle royal game", "yyyyy");
		storeInformationRepository.save(storeInformation2);

		StoreInformation storeInformation3 = new StoreInformation
				("BGMI", "Best Battle royal game for India", "zzzzz");
		storeInformationRepository.save(storeInformation3);

		StoreInformation storeInformation4 = new StoreInformation
				("Minecraft", "Online sandbox game", "aaaaa");
		storeInformationRepository.save(storeInformation4);

		StoreInformation storeInformation5 = new StoreInformation
				("Apex Legend", "Best Multiplayer game", "bbbbb");
		storeInformationRepository.save(storeInformation5);

		storeInformationRepository.findByStoreName("PubG").forEach(
				val -> System.out.println(val)
		);

		storeInformationRepository.findByStorePhoneNumber("bbbbb").forEach(
				val -> System.out.println(val)
		);

		storeInformationRepository.findById(3).ifPresent(
				val -> System.out.println(val)
		);

		System.out.println(storeInformationRepository.count());

		// Performing Deletion Activity

		storeInformationRepository.deleteById(3);

		System.out.println(storeInformationRepository.count());

		storeInformationRepository.findById(3).ifPresent(
				val -> System.out.println(val)
		);
	}
}
