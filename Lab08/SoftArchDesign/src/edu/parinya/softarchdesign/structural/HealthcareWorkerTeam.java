package edu.parinya.softarchdesign.structural;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;


public class HealthcareWorkerTeam implements HealthcareServiceable {
    public Set<HealthcareServiceable> members;



    private Set<HealthcareServiceable> getMembers() {
        if (members == null) {
            members = new LinkedHashSet<>();
        }
        return members;
    }

    public void addMember(HealthcareServiceable member) {
        getMembers().add(member);
    }

    public void removeMember(HealthcareWorker worker) {
        this.members.remove(worker);
    }

    @Override
    public void service() {
        for (HealthcareServiceable member : this.members){
            member.service();
        }
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (HealthcareServiceable member : this.members){
            totalPrice += member.getPrice();
        }
        return totalPrice;
    }
}
