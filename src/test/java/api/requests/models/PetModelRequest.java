package api.requests.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class PetModelRequest {
    Integer id;
    CategoryModelRequest category;
    String name;
    ArrayList<String> photoUrls;
    ArrayList<TagRequestModel> tags;
    String status;
}
