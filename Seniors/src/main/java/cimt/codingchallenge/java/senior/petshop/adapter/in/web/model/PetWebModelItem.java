package cimt.codingchallenge.java.senior.petshop.adapter.in.web.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel("Request for registering a new pet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PetWebModelItem {

	@ApiModelProperty(value = "Name of the pet that is to be registered", example = "Rex")
	private String name;

	@ApiModelProperty(value = "Type of pet to be registered", example = "Dog")
	private String type;
}
