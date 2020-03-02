package hu.gyarmatip.springquizdata.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class QuestionDto {

    private String body;
    private String topic;
    private List<String> options;

}
