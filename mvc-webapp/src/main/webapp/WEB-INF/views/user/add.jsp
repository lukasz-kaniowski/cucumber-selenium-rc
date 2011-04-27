<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<div id="user">
    <h2>User form</h2>
    <form:form id="form" method="post" modelAttribute="user" cssClass="cleanform">
        <div class="header">
            <h2>Form</h2>
        </div>
        <fieldset>
            <legend>Personal Info</legend>
            <form:label path="name">
                Name <form:errors path="name" cssClass="error"/>
            </form:label>
            <form:input path="name"/>


        </fieldset>


    </form:form>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#form").submit(function() {
                $.post($(this).attr("action"), $(this).serialize(), function(html) {
                    $("#forms").replaceWith(html);
                    $('html, body').animate({ scrollTop: $("#message").offset().top }, 500);
                });
                return false;
            });
        });
    </script>
</div>
<c:if test="${!ajaxRequest}">
    </body>
    </html>
</c:if>