# Weather Bit API Automation using BDD with "Cucumber" and "Serenity"
* This project is to automate the weather and forecast API tests using BDD approach with Serenity framework

## Project Description:
* Project setup with Gson and Serenity Rest
* Written in Java with Junit, Cucumber & Maven
* Can run test scripts in parallel

## Setup:
* Install [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
* Install Maven [Maven](https://maven.apache.org/)

## Run tests:
* `mvn clean verify`

## CircleCI Integration
Integrated with Circle CI, new commit to code will trigger API test 

![circleci](https://user-images.githubusercontent.com/7127780/65894110-884c4e80-e3ec-11e9-8827-97ed668c0a70.PNG)



![circleCIBuild](https://user-images.githubusercontent.com/7127780/65894257-c77a9f80-e3ec-11e9-9cd7-d5e59735056d.PNG)





## View HTML Report
* HTML report will be generated once execution finish -bdd-cucumber\target\site\serenity
* Open Index.html in browser to see the reports

#Test Report screenshots

![OverallResults](https://user-images.githubusercontent.com/7127780/65886086-07d32100-e3df-11e9-9940-0c76f34c1a58.PNG)



![requirementsreport](https://user-images.githubusercontent.com/7127780/65885845-a6ab4d80-e3de-11e9-9c4d-3ae018f9c026.PNG)


![WeatherAPItest](https://user-images.githubusercontent.com/7127780/65886280-613b5000-e3df-11e9-8129-319234b589e3.PNG)


![weatherAPIRestQuery](https://user-images.githubusercontent.com/7127780/65886401-9f387400-e3df-11e9-913b-eede7530581a.PNG)


![ForecastApiTest](https://user-images.githubusercontent.com/7127780/65886419-a3fd2800-e3df-11e9-9866-680b89ca26e3.PNG)


![forecastRestquery1](https://user-images.githubusercontent.com/7127780/65886786-4d441e00-e3e0-11e9-9fe6-551f6f1be19c.PNG)



## Maven Integration test logs :

mvn clean verify
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< weather-bit-api:bdd-cucumber >--------------------
[INFO] Building Rest API automation with Serenity BDD and Gson 1.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ bdd-cucumber ---
[INFO] Deleting C:\Users\User\Music\weather-api-automation\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ bdd-cucumber ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\User\Music\weather-api-automation\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ bdd-cucumber ---
[INFO] No sources to compile
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ bdd-cucumber ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ bdd-cucumber ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 9 source files to C:\Users\User\Music\weather-api-automation\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.19.1:test (default-test) @ bdd-cucumber ---
[INFO] Tests are skipped.
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ bdd-cucumber ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO] Building jar: C:\Users\User\Music\weather-api-automation\target\bdd-cucumber-1.0.jar
[INFO]
[INFO] --- maven-failsafe-plugin:2.19.1:integration-test (default) @ bdd-cucumber ---

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running io.weather.runners.WeatherBitAPITest
[main] INFO net.serenitybdd.core.Serenity -

-------------------------------------------------------------------------------------

[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: Verify GET Forecast API
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: Verify Get Current Weather Data
[main] INFO net.serenitybdd.core.Serenity -

TEST STARTED: Verify Current Forecast API with Valid data
-------------------------------------------------------------------(verify-get-forecast-api;verify-current-forecast-api-with-valid-data)
Response ----> net.serenitybdd.rest.decorators.ResponseDecorated@1984212d
 Response Data list :: [{pres=1019.86, moon_phase=0.149488, wind_cdir=NNE, moonrise_ts=1569852717, clouds=63, low_temp=19.6, wind_spd=3.19812, ozone=268.507, pop=10, valid_date=2019-09-30, datetime=2019-09-30, precip=0.375, sunrise_ts=1569841458, min_temp=22.8, weather={code=803, icon=c03d, description=Broken clouds}, app_max_temp=30, max_temp=27.9, snow_depth=0, sunset_ts=1569884070, max_dhi=null, clouds_mid=3, vis=22.9042, uv=5.51106, high_temp=27.8, temp=24.7, clouds_hi=2, app_min_temp=23.4, dewpt=21.7, wind_dir=32, wind_gust_spd=7.9, clouds_low=63, rh=84, slp=1020.68, snow=0, wind_cdir_full=north-northeast, moonset_ts=1569892450, ts=1569816060}, {pres=1018.08, moon_phase=0.240732, wind_cdir=E, moonrise_ts=1569943163, clouds=3, low_temp=19, wind_spd=2.58122, ozone=262.116, pop=0, valid_date=2019-10-01, datetime=2019-10-01, precip=0, sunrise_ts=1569927904, min_temp=19.4, weather={code=801, icon=c02d, description=Few clouds}, app_max_temp=29, max_temp=29, snow_depth=0, sunset_ts=1569970386, max_dhi=null, clouds_mid=0, vis=24.1, uv=7.12603, high_temp=29, temp=24, clouds_hi=0, app_min_temp=19.8, dewpt=17, wind_dir=91, wind_gust_spd=8, clouds_low=3, rh=68, slp=1018.9, snow=0, wind_cdir_full=east, moonset_ts=1569981352, ts=1569902460}, {pres=1014.32, moon_phase=0.342047, wind_cdir=S, moonrise_ts=1570033426, clouds=14, low_temp=18.8, wind_spd=1.27283, ozone=256.554, pop=0, valid_date=2019-10-02, datetime=2019-10-02, precip=0, sunrise_ts=1570014350, min_temp=18.7, weather={code=801, icon=c02d, description=Few clouds}, app_max_temp=32, max_temp=31.1, snow_depth=0, sunset_ts=1570056702, max_dhi=null, clouds_mid=0, vis=24.135, uv=5.52001, high_temp=31, temp=23.8, clouds_hi=14, app_min_temp=19, dewpt=17.6, wind_dir=188, wind_gust_spd=6.00446, clouds_low=0, rh=70, slp=1015.7, snow=0, wind_cdir_full=south, moonset_ts=1570070470, ts=1569988860}, {pres=1013.05, moon_phase=0.44725, wind_cdir=SSW, moonrise_ts=1570119826, clouds=34, low_temp=20.1, wind_spd=1.92775, ozone=258.894, pop=0, valid_date=2019-10-03, datetime=2019-10-03, precip=0, sunrise_ts=1570100797, min_temp=20.1, weather={code=802, icon=c02d, description=Scattered clouds}, app_max_temp=35.9, max_temp=34.1, snow_depth=0, sunset_ts=1570143019, max_dhi=null, clouds_mid=0, vis=24.135, uv=4.86307, high_temp=33.9, temp=25.5, clouds_hi=26, app_min_temp=20.5, dewpt=19.4, wind_dir=213, wind_gust_spd=9.20301, clouds_low=8, rh=71, slp=1014.46, snow=0, wind_cdir_full=south-southwest, moonset_ts=1570159812, ts=1570075260}, {pres=1013.88, moon_phase=0.551283, wind_cdir=SW, moonrise_ts=1570209829, clouds=60, low_temp=13.4, wind_spd=2.97739, ozone=265.498, pop=10, valid_date=2019-10-04, datetime=2019-10-04, precip=0.3125, sunrise_ts=1570187244, min_temp=16.5, weather={code=803, icon=c03d, description=Broken clouds}, app_max_temp=32, max_temp=30.4, snow_depth=0, sunset_ts=1570229336, max_dhi=null, clouds_mid=0, vis=23.7937, uv=2.2982, high_temp=30.3, temp=24.6, clouds_hi=58, app_min_temp=18.9, dewpt=18.4, wind_dir=216, wind_gust_spd=9.5191, clouds_low=11, rh=69, slp=1015.38, snow=0, wind_cdir_full=southwest, moonset_ts=1570162947, ts=1570161660}, {pres=1020.41, moon_phase=0.650261, wind_cdir=NE, moonrise_ts=1570299507, clouds=72, low_temp=14.8, wind_spd=2.8669, ozone=270.712, pop=0, valid_date=2019-10-05, datetime=2019-10-05, precip=0, sunrise_ts=1570273691, min_temp=13.2, weather={code=804, icon=c04d, description=Overcast clouds}, app_max_temp=21.7, max_temp=22.1, snow_depth=0, sunset_ts=1570315653, max_dhi=null, clouds_mid=0, vis=24.1349, uv=2.41785, high_temp=26.4, temp=17.4, clouds_hi=70, app_min_temp=13.4, dewpt=10.8, wind_dir=38, wind_gust_spd=10.0132, clouds_low=11, rh=66, slp=1021.65, snow=0, wind_cdir_full=northeast, moonset_ts=1570252619, ts=1570248060}, {pres=1018.06, moon_phase=0.741208, wind_cdir=E, moonrise_ts=1570388826, clouds=75, low_temp=18.9, wind_spd=1.80375, ozone=270.024, pop=30, valid_date=2019-10-06, datetime=2019-10-06, precip=1.3125, sunrise_ts=1570360138, min_temp=14.7, weather={code=804, icon=c04d, description=Overcast clouds}, app_max_temp=26.7, max_temp=26.8, snow_depth=0, sunset_ts=1570401971, max_dhi=null, clouds_mid=11, vis=22.0095, uv=3.13127, high_temp=27.6, temp=20.1, clouds_hi=60, app_min_temp=14.8, dewpt=16.5, wind_dir=80, wind_gust_spd=4.91525, clouds_low=19, rh=81, slp=1019.49, snow=0, wind_cdir_full=east, moonset_ts=1570342360, ts=1570334460}, {pres=1013.45, moon_phase=0.821693, wind_cdir=SE, moonrise_ts=1570477797, clouds=53, low_temp=17.4, wind_spd=1.50562, ozone=268.743, pop=30, valid_date=2019-10-07, datetime=2019-10-07, precip=1.25, sunrise_ts=1570446585, min_temp=18.6, weather={code=803, icon=c03d, description=Broken clouds}, app_max_temp=29, max_temp=28.3, snow_depth=0, sunset_ts=1570488289, max_dhi=null, clouds_mid=0, vis=23.6953, uv=3.62069, high_temp=25.3, temp=22.9, clouds_hi=48, app_min_temp=19.4, dewpt=19.1, wind_dir=124, wind_gust_spd=4.50979, clouds_low=13, rh=81, slp=1014.8, snow=0, wind_cdir_full=southeast, moonset_ts=1570432115, ts=1570420860}, {pres=1014.42, moon_phase=0.889516, wind_cdir=SSW, moonrise_ts=1570566464, clouds=82, low_temp=12.4, wind_spd=2.89413, ozone=273.799, pop=15, valid_date=2019-10-08, datetime=2019-10-08, precip=0.4375, sunrise_ts=1570533033, min_temp=14.2, weather={code=804, icon=c04d, description=Overcast clouds}, app_max_temp=25.6, max_temp=25.8, snow_depth=0, sunset_ts=1570574608, max_dhi=null, clouds_mid=31, vis=24.0323, uv=1.91097, high_temp=22.6, temp=20.7, clouds_hi=81, app_min_temp=15.7, dewpt=16.2, wind_dir=192, wind_gust_spd=11.7357, clouds_low=12, rh=76, slp=1015.71, snow=0, wind_cdir_full=south-southwest, moonset_ts=1570521853, ts=1570507260}, {pres=1024.03, moon_phase=0.942554, wind_cdir=NE, moonrise_ts=1570654886, clouds=19, low_temp=16.9, wind_spd=3.84076, ozone=282.954, pop=0, valid_date=2019-10-09, datetime=2019-10-09, precip=0, sunrise_ts=1570619481, min_temp=11.9, weather={code=801, icon=c02d, description=Few clouds}, app_max_temp=22.1, max_temp=22.6, snow_depth=0, sunset_ts=1570660928, max_dhi=null, clouds_mid=0, vis=24.135, uv=6.07137, high_temp=20.5, temp=17, clouds_hi=3, app_min_temp=12.4, dewpt=9, wind_dir=39, wind_gust_spd=12.1079, clouds_low=16, rh=60, slp=1025.42, snow=0, wind_cdir_full=northeast, moonset_ts=1570611567, ts=1570593660}, {pres=1024.82, moon_phase=0.978802, wind_cdir=NE, moonrise_ts=1570743128, clouds=100, low_temp=19.4, wind_spd=3.40712, ozone=275.142, pop=20, valid_date=2019-10-10, datetime=2019-10-10, precip=0.8125, sunrise_ts=1570705930, min_temp=16.9, weather={code=804, icon=c04d, description=Overcast clouds}, app_max_temp=19.6, max_temp=23, snow_depth=0, sunset_ts=1570747248, max_dhi=null, clouds_mid=40, vis=24.1352, uv=0.699359, high_temp=20.9, temp=18.1, clouds_hi=98, app_min_temp=16.9, dewpt=15.7, wind_dir=48, wind_gust_spd=9.60056, clouds_low=79, rh=86, slp=1026.19, snow=0, wind_cdir_full=northeast, moonset_ts=1570701269, ts=1570680060}, {pres=1018.71, moon_phase=0.996541, wind_cdir=ENE, moonrise_ts=1570831254, clouds=100, low_temp=19.3, wind_spd=3.97586, ozone=267.761, pop=95, valid_date=2019-10-11, datetime=2019-10-11, precip=49.6875, sunrise_ts=1570792379, min_temp=18.2, weather={code=202, icon=t03d, description=Thunderstorm with heavy rain}, app_max_temp=21, max_temp=20.5, snow_depth=0, sunset_ts=1570833569, max_dhi=null, clouds_mid=98, vis=15.2663, uv=0.707882, high_temp=20.7, temp=19.9, clouds_hi=100, app_min_temp=19.8, dewpt=18.6, wind_dir=77, wind_gust_spd=13.3326, clouds_low=79, rh=92, slp=1019.91, snow=0, wind_cdir_full=east-northeast, moonset_ts=1570790984, ts=1570766460}, {pres=1016.09, moon_phase=0.994553, wind_cdir=NNE, moonrise_ts=1570919324, clouds=80, low_temp=18.4, wind_spd=3.23055, ozone=271.279, pop=15, valid_date=2019-10-12, datetime=2019-10-12, precip=0.5625, sunrise_ts=1570878828, min_temp=18.4, weather={code=804, icon=c04d, description=Overcast clouds}, app_max_temp=19.8, max_temp=23.9, snow_depth=0, sunset_ts=1570919891, max_dhi=null, clouds_mid=9, vis=24.1349, uv=0.861183, high_temp=19.7, temp=19, clouds_hi=36, app_min_temp=18.9, dewpt=17.9, wind_dir=31, wind_gust_spd=10.3319, clouds_low=68, rh=93, slp=1017.32, snow=0, wind_cdir_full=north-northeast, moonset_ts=1570880742, ts=1570852860}, {pres=1015.41, moon_phase=0.972266, wind_cdir=NE, moonrise_ts=1571007399, clouds=10, low_temp=18.9, wind_spd=3.73454, ozone=271.452, pop=20, valid_date=2019-10-13, datetime=2019-10-13, precip=0.0625, sunrise_ts=1570965277, min_temp=18.9, weather={code=801, icon=c02d, description=Few clouds}, app_max_temp=21.2, max_temp=26.9, snow_depth=0, sunset_ts=1571006213, max_dhi=null, clouds_mid=3, vis=24.1351, uv=2.0201, high_temp=26.9, temp=20, clouds_hi=0, app_min_temp=19.2, dewpt=16.7, wind_dir=39, wind_gust_spd=11.7284, clouds_low=8, rh=81, slp=1016.73, snow=0, wind_cdir_full=northeast, moonset_ts=1570970569, ts=1570939260}, {pres=1017.18, moon_phase=0.929816, wind_cdir=NE, moonrise_ts=1571095537, clouds=45, low_temp=18.8, wind_spd=4.04342, ozone=271.388, pop=65, valid_date=2019-10-14, datetime=2019-10-14, precip=6.1875, sunrise_ts=1571051727, min_temp=18.8, weather={code=201, icon=t02d, description=Thunderstorm with rain}, app_max_temp=20.8, max_temp=25.4, snow_depth=0, sunset_ts=1571092536, max_dhi=null, clouds_mid=36, vis=17.7842, uv=1.6536, high_temp=25.4, temp=20, clouds_hi=11, app_min_temp=19.9, dewpt=17.7, wind_dir=52, wind_gust_spd=12.5147, clouds_low=6, rh=87, slp=1018.5, snow=0, wind_cdir_full=northeast, moonset_ts=1571060478, ts=1571025660}, {pres=1017.77, moon_phase=0.868057, wind_cdir=NE, moonrise_ts=1571183805, clouds=12, low_temp=19.8, wind_spd=3.40324, ozone=264.988, pop=35, valid_date=2019-10-15, datetime=2019-10-15, precip=1.5, sunrise_ts=1571138177, min_temp=19.3, weather={code=801, icon=c02d, description=Few clouds}, app_max_temp=20.1, max_temp=25.7, snow_depth=0, sunset_ts=1571178860, max_dhi=null, clouds_mid=9, vis=24.1351, uv=2.26312, high_temp=25.7, temp=19.5, clouds_hi=0, app_min_temp=19.6, dewpt=17.5, wind_dir=48, wind_gust_spd=10.8, clouds_low=2, rh=88, slp=1019.06, snow=0, wind_cdir_full=northeast, moonset_ts=1571150459, ts=1571112060}]
 state_code :: state_code ---> 2019-09-30
[main] INFO net.serenitybdd.core.Serenity -


TEST PASSED: Verify Current Forecast API with Valid data
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 
TEST PASSED: Verify Current Forecast API with Valid data
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 

TEST STARTED: Verify Current Weather API with Valid data
-------------------------------------------------------------------(verify-get-current-weather-data;verify-current-weather-api-with-valid-data)
Response ----> net.serenitybdd.rest.decorators.ResponseDecorated@11d86b9d
 Response Data list :: [{sunrise=01:04, pod=n, pres=715.446, timezone=Asia/Bishkek, ob_time=2019-09-30 14:25, wind_cdir=S, lon=73.94, clouds=100, wind_spd=0.851095, city_name=Kara-Kulja, h_angle=-90, datetime=2019-09-30:14, precip=0, weather={code=804, icon=c04n, description=Overcast clouds}, station=UCFO, elev_angle=-14.26, dni=0, lat=40.73, vis=0.188955, uv=0, temp=1.5, dhi=0, ghi=0, app_temp=-3, dewpt=0.6, wind_dir=187, solar_rad=0, country_code=KG, rh=94, slp=1017.3, snow=5.25, sunset=12:52, last_ob_time=2019-09-30T13:30:00, aqi=32, state_code=08, wind_cdir_full=south, ts=1569853553}]
 state_code :: state_code ---> 08
[main] INFO net.serenitybdd.core.Serenity -
 
TEST PASSED: Verify Current Weather API with Valid data
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -


TEST PASSED: Verify Current Weather API with Valid data
----------------------------------------------------------------------------

2 Scenarios (2 passed)
10 Steps (10 passed)
0m9.571s

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 15.135 sec - in io.weather.runners.WeatherBitAPITest

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent! The file encoding for reports output files should be provided by the POM property ${project.reporting.outputEncoding}.
[INFO]
[INFO] --- serenity-maven-plugin:1.8.3:aggregate (serenity-reports) @ bdd-cucumber ---
[INFO] current_project.base.dir: C:\Users\User\Music\weather-api-automation
[INFO] Generating test results for 2 tests
[INFO] 3 requirements loaded after 379 ms
[INFO] 3 related requirements found after 381 ms
[INFO] Generating test outcome reports: false
[INFO] Starting generating reports: 435 ms
[INFO] Configured report threads: 20
[INFO] Test results for 2 tests generated in 1959 ms
[INFO]
[INFO] --- maven-failsafe-plugin:2.19.1:verify (default) @ bdd-cucumber ---
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent! The file encoding for reports output files should be provided by the POM property ${project.reporting.outputEncoding}.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  59.734 s
[INFO] Finished at: 2019-10-01T00:26:03+10:00
[INFO] ------------------------------------------------------------------------


