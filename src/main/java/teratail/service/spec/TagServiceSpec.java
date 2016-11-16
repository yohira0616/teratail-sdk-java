package teratail.service.spec;

import teratail.model.response.TagEntity;
import teratail.model.response.TagListEntity;

public interface TagServiceSpec {

  TagListEntity findAll();

  TagEntity findOne(String tagName);

  TagListEntity findByTagName(String tagName);
}
