package asia.asoulcnki.api.service.impl;

import asia.asoulcnki.api.persistence.entity.Reply;
import asia.asoulcnki.api.persistence.mapper.ReplyMapper;
import asia.asoulcnki.api.service.IReplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class IReplyServiceImpl extends ServiceImpl<ReplyMapper, Reply> implements IReplyService {
}
