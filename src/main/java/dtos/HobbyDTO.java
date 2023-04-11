package dtos;

import entities.Hobby;

import java.util.List;
import java.util.stream.Collectors;

public class HobbyDTO {
    private Long id;
    private String name;
    private String description;
    private List<String> personDTOList;

    public HobbyDTO(Hobby hobby) {
        this.id = hobby.getId();
        this.name = hobby.getName();
        this.description = hobby.getDescription();
        if (hobby.getPersonList() != null) {
            this.personDTOList = hobby.getPersonList().stream().map(person -> person.getName()).collect(Collectors.toList());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
