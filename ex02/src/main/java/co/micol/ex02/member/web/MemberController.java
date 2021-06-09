package co.micol.ex02.member.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.micol.ex02.member.service.MemberService;
import co.micol.ex02.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService dao;		// == new MemberserviceImpl()
	
	@RequestMapping("/member.do")
	public String member(Model model) {
		String str = "스프링 프레임워크는 배우기가 쉽다.";
		model.addAttribute("message",str);
		return "member/member";
	}
	
//	@RequestMapping("/memberList.do")
//	public ModelAndView memberList(ModelAndView mv) {
//		mv.addObject("members", dao.memberSelectList());
//		mv.setViewName("member/memberList");
//		return mv;
//	}

	@RequestMapping("/memberList.do")
	public String memberList(Model model) {
		model.addAttribute("members", dao.memberSelectList());
	return "member/memberList";
	}
	
	@RequestMapping("/memberInsert.do")
	public String memberInsert(Model model) {
		return ("member/memberInput");  //처리후 .do 실행 
	}
	
	@RequestMapping("/memberResister.do")
	public String memberResister(MemberVO vo, Model model) {
	 dao.memberInsert(vo);
		return "redirect:memberList.do";
	}
}
