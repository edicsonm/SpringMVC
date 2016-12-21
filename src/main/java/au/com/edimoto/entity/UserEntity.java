package au.com.edimoto.entity;

import org.springframework.stereotype.Component;

/**
 * Created by torree on 12/12/2016.
 */
@Component
public class UserEntity {

    private String name;
    private String familyName;

    public UserEntity() {
    }

    public UserEntity(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
