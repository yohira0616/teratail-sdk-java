package teratail.service.spec;

import teratail.model.response.tag.TagEntity;
import teratail.model.response.tag.TagListEntity;
import teratail.model.response.tag.TagQuestionEntity;

public interface TagServiceSpec {

  TagListEntity findAll();

  TagEntity findOne(String tagName);

  TagQuestionEntity findByTagName(String tagName);
}
