package dtos;

import entities.Person;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDTO {
    private Long id;
    private String name;
    private int age;
    private List<HobbyDTO> hobbyDTOList;

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.age = person.getAge();
        if (person.getHobbyList() != null) {
            this.hobbyDTOList = person.getHobbyList().stream().map(hobby -> new HobbyDTO(hobby)).collect(Collectors.toList());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<HobbyDTO> getHobbyDTOList() {
        return hobbyDTOList;
    }

    public void setHobbyDTOList(List<HobbyDTO> hobbyDTOList) {
        this.hobbyDTOList = hobbyDTOList;
    }

    public static List<PersonDTO> getDtos(List<Person> personList){
        return personList.stream().map(p -> new PersonDTO(p)).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
