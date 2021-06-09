<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원등록</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>회원등록화면</h1>
		</div>
		<div>
			<form id="frm" name="frm" action="memberResister.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="100">아이디</th>
							<td width="300"><input type="text" id="id" name="id"></td>
						</tr>
						<tr>
							<th width="100">이름</th>
							<td width="300"><input type="text" id="name" name="name"></td>
						</tr>
						<tr>
							<th width="100">비밀번호</th>
							<td width="300"><input type="text" id="password"
								name="password"></td>
						</tr>
						<tr>
							<th width="100">번호</th>
							<td width="300"><input type="text" id="tel" name="tel"></td>
						</tr>
					</table>
				</div>
				<br />
				<div>
					<input type="submit" value="등록하기">&nbsp;&nbsp;
					<input type="reset" value="등록취소">&nbsp;&nbsp;
					<input type="button" value="회원목록보기" onclick="location.href='memberList.do'">&nbsp;&nbsp;
				</div>
			</form>
		</div>
	</div>
</body>
</html>