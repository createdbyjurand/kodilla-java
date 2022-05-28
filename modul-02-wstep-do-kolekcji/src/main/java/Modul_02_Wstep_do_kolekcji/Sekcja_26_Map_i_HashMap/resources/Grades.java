package Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources;

public class Grades {

    Grade[] polish;
    Grade[] maths;
    Grade[] history;
    Grade[] music;

    public Grades(Grade[] polish, Grade[] maths, Grade[] history, Grade[] music) {
        this.polish = polish;
        this.maths = maths;
        this.history = history;
        this.music = music;
    }

    private int averageGrade(Grade[] grades) {
        int average = 0;
        for (Grade grade : grades) {
            average += grade.getGradeInt();
        }
        return average / grades.length;
    }

    public int getAverageGradeFromPolish() {
        return averageGrade(polish);
    }

    public int getAverageGradeFromMaths() {
        return averageGrade(maths);
    }

    public int getAverageGradeFromHistory() {
        return averageGrade(history);
    }

    public int getAverageGradeFromMusic() {
        return averageGrade(music);
    }

    public String toString() {
        return (
            "polish: " +
            getAverageGradeFromPolish() +
            ", maths: " +
            getAverageGradeFromMaths() +
            ", history: " +
            getAverageGradeFromHistory() +
            ", music: " +
            getAverageGradeFromMusic()
        );
    }
}
