package com.phani.assignment04;

class Employee {
    private String name;
    private int IdNumber;
    private String department;
    private String position;

    /**
     * @param name
     * @param idNumber
     * @param department
     * @param position
     */
    public Employee(String name, int idNumber, String department, String position) {
        super();
        this.name = name;
        IdNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the idNumber
     */
    public int getIdNumber() {
        return IdNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(int idNumber) {
        IdNumber = idNumber;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("%20s%20d%20s%20s", name, IdNumber, department, position);
        //return name + "\t" + IdNumber + "\t" + department + "\t\t\t" + position;
    }

}