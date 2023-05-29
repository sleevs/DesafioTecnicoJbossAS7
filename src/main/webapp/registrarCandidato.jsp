<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <title><bean:message key="label.registroCandidato.title" locale="display"/></title>


</head>

<body id="public">

<div id="container">

    <html:form action="/registroCandidato" method="post" styleClass="javachap topLabel">
        <html:hidden property="action" value="registroCandidato"/>
        <div class="info">
            <h2><bean:message key="label.registroCandidato.heading" locale="display" /></h2>
            <p><bean:message key="label.registroCandidato.headingCaption" locale="display" /></p>
        </div>

        <ul>
            <logic:messagesPresent >
                <li id="errorLi">
                    <h3 id="errorMsgLbl"><html:errors locale="display"/></h3>
                </li>
            </logic:messagesPresent>

            <li class="">
                <label for="nome" class="desc">
                    <bean:message key="label.nome" locale="display" />
                </label>
                <div>
                    <html:text property="nome" maxlength="255"
                        tabindex="4" styleClass="field text medium"/>
                </div>
            </li>
            
             <li class="">
                <label for="email" class="desc">
                    <bean:message key="label.email" locale="display" />
                </label>
                <div>
                    <html:text property="email" maxlength="255"
                        tabindex="4" styleClass="field text medium"/>
                </div>
            </li>
            
             <li class="">
                <label for="telefone" class="desc">
                    <bean:message key="label.telefone" locale="display" />
                </label>
                <div>
                    <html:text property="telefone" maxlength="255"
                        tabindex="4" styleClass="field text medium"/>
                </div>
            </li>
             <li class="">
                <label for="experiencia" class="desc">
                    <bean:message key="label.experiencia" locale="display" />
                </label>
                <div>
                    <html:text property="experiencia" maxlength="255"
                        tabindex="4" styleClass="field text medium"/>
                </div>
            </li>
            
            
            


            <li class="buttons">
                <html:submit tabindex="6" styleClass="btTxt">
                    <bean:message key="button.label.registroCandidato" locale="display"/>
                </html:submit>
            </li>

        </ul>
    </html:form>
</div>

</body>
</html>