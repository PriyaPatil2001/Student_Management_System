<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<div class="d-flex justify-content-center align-center">
		<div class="w-50 align-middle border border-info border-3 mt-2"
			style="height: 500px">
			<h6 class="p-3 text-primary ">
				<u>Update New Batch :</u>
			</h6>
			<div class="border border-secondary m-3 p-2">
				<table class="table table-hover border border-secondary ">
					<tbody>
						<tr class="table-primary fs-6">
							<th>Student Id</th>
							<td>${st.studentId}</td>
						</tr>
						<tr class="table-primary fs-6">
							<th>Student Name</th>
							<td>${st.studentFullName}</td>
						<tr class="table-primary fs-6">
							<th>Course Name</th>
							<td>${st.studentCourse}</td>
						</tr>

						<tr class="table-primary fs-6">
							<th>Batch Number</th>
							<td>${st.batchNumber}</td>
						</tr>
						</tr>
						<tr class="table-danger fs-6">
							<th>Fees Paid</th>
							<td>${st.feesPaid}</td>
						</tr>

					</tbody>
				</table>
				<form action="shiftbatchform" method="get"> 
                <input type="hidden" name="studentId" value="${st.studentId}">
                
                <div class="row">
										<div class="col">
										<label for="batchMode" class="text-info"><b>Select New Batch Number</b></label>
											<select class="select form-control-sm" name="batchMode">
												<option value="#" disabled>Select Batch Mode</option>
												<option value="Online">Online</option>
												<option value="Offline">Offline</option>

											</select> <label class="form-label select-label">Batch Mode</label>
										</div>

    <div class="bg-dark p-2 d-flex justify-content-between">
        <label for="batchNumber" class="text-info"><b>Select New Batch Number</b></label>
        <select class="form-select w-50" name="batchNumber" required>
            <option value="" disabled selected>-- Select Batch --</option>
            <option value="FDJ-160">FDJ-160</option>
            <option value="REG-160">REG-160</option>
            <option value="FDJ-161">FDJ-161</option>
            <option value="REG-162">REG-162</option>
            <option value="FDJ-190">FDJ-190</option>
            <option value="REG-190">REG-190</option>
        </select>
    </div>

    <div class="mt-2 text-center">
        <button class="btn btn-outline-primary" type="submit">Submit</button>
    </div>
</form>
			</div>
		</div>
	</div>
</body> 
</html>