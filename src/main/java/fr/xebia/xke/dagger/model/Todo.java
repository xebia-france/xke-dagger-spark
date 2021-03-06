package fr.xebia.xke.dagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jongo.marshall.jackson.oid.Id;
import org.jongo.marshall.jackson.oid.ObjectId;

public class Todo {

    private final String id;

    private final String title;

    private final String description;

    @JsonCreator
    public Todo(@ObjectId @Id String id, @JsonProperty("title") String title, @JsonProperty("description") String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @Id
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
