package com.example.moamz.controller.admin.userInquiry;

import com.example.moamz.domain.dto.admin.userInquiry.AdminUserInquiryDetailDTO;
import com.example.moamz.domain.dto.admin.userInquiry.AdminUserInquiryListDTO;
import com.example.moamz.service.admin.userInquiry.AdminUserInquiryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@Controller
@RequestMapping("admin/userInquiry")
@RequiredArgsConstructor
@Slf4j
public class AdminUserInquiryController {

    private final AdminUserInquiryService adminUserInquiryService;

    //일반회원 문의목록 보여주기
    @GetMapping("/list")
    public String inquiryList(@SessionAttribute(value="fgUserCode",required=false) Long fgUserCode, Model model){
        List<AdminUserInquiryListDTO> adminUserInquiryListDTO = adminUserInquiryService.findInquiryList();

        model.addAttribute("adminUserInquiryListDTO", adminUserInquiryListDTO);
        return "admin/adminUserInquiryList";
    }

    //문의 상세페이지 보여주기
    @GetMapping("/detail")
    public String inquiryDetail(@RequestParam("fgPostId") Long fgPostId, Model model){
        System.out.println("view 컨트롤러");
        AdminUserInquiryDetailDTO adminUserInquiryDetailDTO = adminUserInquiryService.findInquiryDetail(fgPostId);

        model.addAttribute("adminUserInquiryDetailDTO", adminUserInquiryDetailDTO);
        return "/admin/adminUserInquiryDetail";
    }
}























