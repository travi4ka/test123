package api.responses;

import lombok.Data;

import java.util.ArrayList;

@Data
public class PetModelResponse {
    Integer id;
    CategoryModelResponse category;
    String name;
    ArrayList<String> photoUrls;
    ArrayList<TagRequestResponse> tags;
    String status;
}
