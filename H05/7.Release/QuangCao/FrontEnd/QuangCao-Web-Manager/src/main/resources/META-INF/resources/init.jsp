<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="javax.portlet.PortletPreferences"%>
<%@ page import="java.util.Enumeration"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.Locale"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.ResourceBundle"%>
<%@ page import="javax.portlet.WindowState"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.taglib.search.ResultRow" %><%@
page import="com.liferay.taglib.search.SearchEntry" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security"%><%@
page import="com.liferay.taglib.aui.AUIUtil" %>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.service.UserGroupRoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.UserGroupRole"%>
<%@page import="com.liferay.portal.kernel.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<script>
function expandingWindow(website) {
	var windowprops = "width=100,height=100,scrollbars=yes,status=yes,resizable=no";
	var heightspeed = 20; // vertical scrolling speed (higher = slower)
	var widthspeed = 20;  // horizontal scrolling speed (higher = slower)
	var leftdist = 10;    // distance to left edge of window
	var topdist = 10;     // distance to top edge of window
	var winwidth = 650;
	var winheight = 700;
	if (window.resizeTo && navigator.userAgent.indexOf("Opera") == -1) {
		var sizer = window.open("", "", "left=" + leftdist + ",top=" + topdist + "," + windowprops);
		for (var sizeheight = 1; sizeheight < winheight; sizeheight += heightspeed) {
			sizer.resizeTo("1", sizeheight);
		}
		for (var sizewidth = 1; sizewidth < winwidth; sizewidth += widthspeed) {
			sizer.resizeTo(sizewidth, sizeheight);
		}
		sizer.location = website;
	} else {
		
		window.open(website, "mywindow");
	}
}
</script>