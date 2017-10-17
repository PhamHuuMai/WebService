<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="row"
	style="margin-top: 20px; margin-left: 10px; width: 700px;">
	<table class="table table-bordered">
		<tbody>
			<tr>
				<th colspan="2">
					<h5>Mã giải thưởng ${prizes.lottezyId} </h5>
					<h5>Tên giải thưởng ${prizes.lottezyName} </h5>
					<h5>Mở thưởng ngày ${prizes.date}</h5>
				</th>
				<th colspan="2">
					<h3> Lô </h3>
				</th>
			</tr>
			<tr>
				<td title="Giải ĐB">ĐB</td>
				<td><em>${prizes.specialPrize}</em></td>
				<td><em>${prizes.specialPrize}</em></td>
			</tr>
			<tr>
				<td title="Giải nhất">G1</td>
				<td>
					<p>${prizes.firstPrize}</p>
				</td>
				<td>
					<p>${prizes.firstPrize}</p>
				</td>
			</tr>
			<tr>
				<td title="Giải nhì">G2</td>
				<td>
					<p>${prizes.secondPrize}</p>
				</td>
				<td>
					<p>${prizes.firstPrize}</p>
				</td>
			</tr>
			<tr>
				<td title="Giải ba">G3</td>
				<td>
					<p>${prizes.thirdPrize}</p>
				</td>
				<td>
					<p>${prizes.firstPrize}</p>
				</td>
			</tr>
			<tr>
				<td title="Giải tư">G4</td>
				<td>
					<p>${prizes.fourtyPrize}</p>
				</td>
				<td>
					<p>${prizes.firstPrize}</p>
				</td>
			</tr>
			<tr>
				<td title="Giải năm">G5</td>
				<td>
					<p>${prizes.fiftyPrize}</p>
				</td>
				<td>
					<p>${prizes.firstPrize}</p>
				</td>
			</tr>
		</tbody>
	</table>
</div>