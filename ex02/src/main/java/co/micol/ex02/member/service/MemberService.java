package co.micol.ex02.member.service;

import java.util.List;

import co.micol.ex02.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList();		//전체조히
	MemberVO memberSelect(MemberVO vo);		//한건조회
	int memberInsert(MemberVO vo);			//추가
	int memberDelete(MemberVO vo);			//삭제
	int memberUpdate(MemberVO vo);			//수정
}
