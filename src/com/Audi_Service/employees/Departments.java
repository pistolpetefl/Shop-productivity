package com.Audi_Service.employees;

// I'm likely going to rename this class and slightly change the functionality of "department" to represent job title or something similar,
// however right now is working to the scope that I need it to, and that's a problem for future me to solve.
// ALSO I'm not sure that this is the best way to solve the problem that it's implemented for, so I'm looking into that before
// i spend time re-writing this.

public class Departments {

        private String departments[];

        public Departments() {
            this.departments = new String[] {"Service Advisor", "Technician", "Parts Advisor", "Salesman"};
        }

        public String getDepartment(int department) {
            return this.departments[department];
        }
}
