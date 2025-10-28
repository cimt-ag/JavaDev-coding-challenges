package cimt.codingchallenge.java.senior.out.database;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import cimt.codingchallenge.java.senior.petshop.adapter.out.database.PetDatabaseAdapter;
import cimt.codingchallenge.java.senior.petshop.adapter.out.database.PetEntityMapperImpl;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({ PetDatabaseAdapter.class, PetEntityMapperImpl.class })
class PetDatabaseAdapterIntegrationTest {

	@Autowired
	PetDatabaseAdapter databaseAdapter;

	@Test
	void should_allow_saving_and_retreiving_pets() {
		//TODO: Implement me!
	}

}
