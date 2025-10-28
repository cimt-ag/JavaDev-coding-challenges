package cimt.codingchallenge.java.senior.petshop.adapter.in.web.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PetWebModelItem {

	@Schema(example = "Rex")
	private String name;

	@Schema(example = "Dog")
	private String type;
}
