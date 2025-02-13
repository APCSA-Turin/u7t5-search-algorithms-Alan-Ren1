package com.example.project.Repair;
import java.util.ArrayList;

public class RepairSchedule {

    /** Each element represents a repair by an individual mechanic in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;

    /** Constructs a RepairSchedule object.
     * Precondition: n >= 0
     */
    public RepairSchedule(int n) {
        this.numberOfMechanics = n;
        this.schedule = new ArrayList<CarRepair>();
    }

    public ArrayList<CarRepair> getSchedule() {
        return schedule;
    }

    /** Attempts to schedule a repair by a given mechanic in a given bay.
     * Precondition: 0 <= m < numberOfMechanics and b >= 0
     */
    public boolean addRepair(int m, int b) {
        // Check if mechanic m is already assigned to a repair
        for (CarRepair repair : schedule) {
            if (repair.getMechanicNum() == m) {
                return false; // mechanic is already scheduled
            }
        }

        // Check if bay b is already occupied
        for (CarRepair repair : schedule) {
            if (repair.getBayNum() == b) {
                return false; // bay is already occupied
            }
        }

        // If neither the mechanic nor the bay is occupied, add the repair
        CarRepair newRepair = new CarRepair(m, b);
        schedule.add(newRepair);
        return true;
    }

    /** Returns an ArrayList containing the mechanic identifiers of all available mechanics. */
    public ArrayList<Integer> availableMechanics() {
        ArrayList<Integer> available = new ArrayList<Integer>();

        // Add mechanics who are not already assigned
        for (int i = 0; i < numberOfMechanics; i++) {
            boolean isAssigned = false;
            for (CarRepair repair : schedule) {
                if (repair.getMechanicNum() == i) {
                    isAssigned = true;
                    break;
                }
            }
            if (!isAssigned) {
                available.add(i);
            }
        }

        return available;
    }

    /** Removes an element from schedule when a repair is complete. */
    public void carOut(int b) {
        for (int i = 0; i < schedule.size(); i++) {
            CarRepair carAtIdx = schedule.get(i);
            if (carAtIdx.getBayNum() == b) {
                schedule.remove(i);
            }
        }
    }
}
