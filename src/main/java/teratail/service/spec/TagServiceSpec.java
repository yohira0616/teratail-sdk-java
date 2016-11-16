package teratail.service.spec;

import teratail.model.question.Question;
import teratail.model.tag.Tag;

import java.util.List;

public interface TagServiceSpec {

  List<Tag> findAll();

  Tag findOne(String tagName);

  List<Question> findByTagName(String tagName);
}
