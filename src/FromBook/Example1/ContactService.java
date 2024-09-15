package FromBook.Example1;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    //=================================================================================\\
    //=========== Following 3 were created to serve three different logics. All three were doing some kind of match and returning data. Otherwise, rest are same
    //=========== So this can be reduced or rewritten so that whole thing can be reused just by sending the match criteria as parameter.
    public List<Contact> findContactAgedBetween18and25(List<Contact> contacts){
        List<Contact> contactAgedBetween18and25 = new ArrayList<>();
        for(Contact contact: contacts){
            if(18 <= contact.getAge() && contact.getAge()<=25){
                contactAgedBetween18and25.add(contact);
            }
        }
        return contactAgedBetween18and25;
    }

    public List<Contact> findMaleContactAgedBetween18and25(List<Contact> contacts){
        List<Contact> maleContactAgedBetween18and25 = new ArrayList<>();
        for(Contact contact: contacts){
            if(18 <= contact.getAge() && contact.getAge()<=25
            &&  contact.getGender().equals(Contact.Gender.MALE)){
                maleContactAgedBetween18and25.add(contact);
            }
        }
        return maleContactAgedBetween18and25;
    }

    public List<Contact> findFeMaleContactAgedBetween18and25(List<Contact> contacts){
        List<Contact> femaleContactAgedBetween18and25 = new ArrayList<>();
        for(Contact contact: contacts){
            if(18 <= contact.getAge() && contact.getAge()<=25
                    &&  contact.getGender().equals(Contact.Gender.FEMALE)){
                femaleContactAgedBetween18and25.add(contact);
            }
        }
        return femaleContactAgedBetween18and25;
    }
    //=================================================================================\\

    /**
     * Use Interface based anonymous inner class to avoid duplicate code of above
     **/
    public List<Contact> findContacts(List<Contact>contacts, FilterCriteria filterCriteria){
        List<Contact> matchedContacts = new ArrayList<>();

        for(Contact contact: contacts){
            if(filterCriteria.match(contact))
                matchedContacts.add(contact);
        }
        return matchedContacts;
    }

}
