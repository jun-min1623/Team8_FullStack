package site.devroad.softeer.src.course.model;

public class Subject {
    private Long id;
    private String name;
    private String explain;

    public Subject(Long id, String name, String explain){
        this.id = id;
        this.name = name;
        this.explain = explain;
    }
}