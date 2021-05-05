package io.github.leitess.HeroesManager.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "heroes")
public class Heroes {

    @Id
    private ObjectId _id;

    private String name;

    private String universe;

    private String story;

    private String city;

    private String mainImageUrl;

    private String authorName;

    private String authorImageUrl;
}
