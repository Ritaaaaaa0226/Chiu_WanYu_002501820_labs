/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {


    ArrayList<FacultyProfile> facultylist;

    public FacultyDirectory() {

     facultylist = new ArrayList();

    }

    public FacultyProfile newFacultyProfile(Person p) {

        FacultyProfile fp = new FacultyProfile(p);
        facultylist.add(fp);
        return fp;
    }

    public FacultyProfile findFaculty(String id) {

        for (FacultyProfile fp : facultylist) {

            if (fp.isMatch(id)) {
                return fp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
