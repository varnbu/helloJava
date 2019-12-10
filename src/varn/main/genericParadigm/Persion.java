package varn.main.genericParadigm;

public class Persion implements Comparable<Persion> {
    String name;
    int score;


    public Persion(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Persion other) {
        return this.name.compareTo(other.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
