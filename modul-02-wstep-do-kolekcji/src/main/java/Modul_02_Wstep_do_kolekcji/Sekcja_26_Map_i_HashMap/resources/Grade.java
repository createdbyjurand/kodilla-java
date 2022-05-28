package Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources;

public enum Grade {
  F(1),
  E(2),
  D(3),
  C(4),
  B(5),
  A(6);

  private final int grade;

  private Grade(int grade) {
    this.grade = grade;
  }

  public int getGradeInt() {
    return grade;
  }

  @Override
  public String toString() {
    return grade + "";
  }
}
