package Homework5;

/*Задача 1:
Создать программу для имитации работы клиники.
Пусть в клинике будет три врача: хирург, терапевт и дантист.
Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
Так же предусмотреть класс «Пациент» с полем «План лечения» и полем «Доктор».
Создать объект класса «Пациент» и добавить пациенту план лечения.
У терапевта создать метод, который будет назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.*/

public class Homework5_1 {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();  //создаём терапевта

        Patient patient1 = new Patient(2);  //создаём трёх пациентов с разными кодами
        Patient patient2 = new Patient(1);
        Patient patient3 = new Patient(3);

        therapist.assignDoctor(patient1);
        therapist.assignDoctor(patient2);
        therapist.assignDoctor(patient3);

    }
}
    abstract class Doctor {  //создаём абстрактный класс Доктор - шаблон для всех врачей
        public abstract void treat();
    }

    class Surgeon extends Doctor {  //хирург, наследование от Доктора
        @Override
        public void treat() {
          System.out.println("Хирург чинит");
        }
    }
    class Dentist extends Doctor {  //дантист, наследование от Доктора
        @Override
        public void treat() {
            System.out.println("Дантист лечит зубы");
        }
    }
    class Therapist extends Doctor {  //терапевт, наследование от Доктора
        @Override
        public void treat() {
            System.out.println("Терапевт направляет");
        }

        public void assignDoctor(Patient patient) {  //метод, который назначает пациенту врача
            int plan = patient.getTreatmentPlan();  //получаем сначала план лечения с помощью геттера, т.к. поле treatmentPlan — private

            Doctor assignedDoctor; // объявим переменную для назначенного врача

            if (plan == 1) {
                assignedDoctor = new Surgeon();  //если код 1 - создаём нового хирурга и записываем его в переменную
            } else if (plan == 2) {
                assignedDoctor = new Dentist();  //если код 2 - создаём нового дантиста и записываем его в переменную
            } else {                             //иначе создаём нового терапевта
                assignedDoctor = new Therapist();
            }

            patient.setDoctor(assignedDoctor); // тут вызываем сеттер пациента и назначаем врача, сеттер - т.к. private
            assignedDoctor.treat(); // вызываем метод treat у назначенного врача
        }
    }

    class Patient {  //класс пациент
        private int treatmentPlan;  //приватно - защищаем данные пациента (инкапсуляция)
        private Doctor doctor;

        public Patient (int treatmentPlan) {  //конструктор для пациента с планом лечение
            this.treatmentPlan = treatmentPlan;
            this.doctor = null;  //врач пока не назначен
        }

        public int getTreatmentPlan() {  //геттер для плана лечения
            return treatmentPlan;
        }
        public Doctor getDoctor() {  // геттер для доктора
           return doctor;
        }

        public void setTreatmentPlan (int newTreatmentPlan) {  //cеттер для плана лечения
            this.treatmentPlan = newTreatmentPlan;
        }

        public void setDoctor (Doctor newDoctor) {  //cеттер для доктора
            this.doctor = newDoctor;
        }


}
