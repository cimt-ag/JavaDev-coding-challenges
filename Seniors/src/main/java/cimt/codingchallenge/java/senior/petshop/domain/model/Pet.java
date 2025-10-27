package cimt.codingchallenge.java.senior.petshop.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Pet {
	private String name;
	private String type;
}
