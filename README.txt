This project is the demo for testng method level parameterized test.

Example:
<suite verbose="0" name="Xml suite">
	<test name="My Run Test" preserve-order="false">
		<classes>
			<class name="org.testng.demo.RunTest">
				<methods>
					<parameter name="test002_num1" value="10"></parameter>
					<include name="test001">
						<parameter name="test001_name" value="Storm Qi"></parameter>
					</include>
					<include name="test001">
						<parameter name="test001_name" value="Sean Guo"></parameter>
					</include>
					<include name="test002">
						<parameter name="test002_num2" value="25"></parameter>
					</include>
					<include name="test003"></include>
				</methods>
			</class>
		</classes>
	</test>
</suite>

The test method test001 will be called twice with the parameter "Storm Qi" and "Sean Guo".