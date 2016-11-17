package teratail.service.spec;

import teratail.model.request.Pagination;
import teratail.model.response.tag.TagEntity;
import teratail.model.response.tag.TagListEntity;
import teratail.model.response.tag.TagQuestionEntity;

public interface TagServiceSpec {

  TagListEntity findAll();

  TagListEntity findAll(Pagination pagination);

  TagEntity findOne(String tagName);

  TagQuestionEntity findByTagName(String tagName);

  TagQuestionEntity findByTagName(String tagName,Pagination pagination);
}
