package com.example.moamz.mapper.main;

import com.example.moamz.domain.dto.main.MainNoticeDetailDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainNoticeDetailMapper {
    MainNoticeDetailDTO selectMainNoticeDetail(Long fgPostId);
}
