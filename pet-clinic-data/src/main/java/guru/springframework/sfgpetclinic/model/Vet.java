package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person {
    private Set<Speciality> specialities;

    public Set<Speciality> getSpeciality() {
        return specialities;
    }

    public void setSpeciality(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
