# zAdviser Dashboards

zAdviser currently has three types of Dashboards. "A" Record Usage Dashboards, "Z" Record Usage Dashboards and "KPI" Dashboards

# "A" Record Usage Dashboards
  - Should be used when Compuware products are not at release 17.02 or greater with current maintenance
  - Will contain NOT contain feature/function usage information and other valuable information found in the "Z" Record Usage Dashboards
  
# "Z" Record Usage Dashboards
  - Used when Compuware products are at release 17.02 or greater and have current maintenance applied   
  - Compuware Global Parameter member (CWGLxxxx) is updated with ZADVISER_SMF_VERSION = 17.02.07
  - Will contain rich feature/function usage information not found in the "A" Record Usage Dashboards
  
# "KPI" Dashboards (Key Performance Indicators)
  - Designed to provide Quality, Velocity, and Efficiency performance metrics
  - KPI Overview dashboard shows you a snapshot of the KPIs for the timeframe selected
  - KPI Details dashboard shows you how the KPIs are trending on a weekly basis
  - Allows the user to make business decisions based upon real data for their development teams
  -
# The KPIs Defined
  - **Mean Time To Repair (MTTR)** - Measures how quickly defects are being fixed. It measures the amount of time from when a defect is reported until the fix is completed and closed. The measurement is derived by looking at the ITSM data that would track when a defect is logged and closed. It's am indication of how quickly we can fix bugs. It falls under the heading of Velocity in measuring performance.
  - **Mean Time from Checkout to Production (MTCP)** - Measures how long long an application is in development before its put back into Production. The measurement is derived from the SCM data to see when it was first checked out and when it was moved back into production. It's an indication of how quickly we get code back into production. It falls under the heading of Velocity in measuring performance.
  - **Containers Deployed** - Measures how many packages or containers are being deployed over time. The measurement is derived from the SCM data and gives us an idea of how many applications we are deploying. It falls under the heading of Velocity in measuring performance.
  - **Elements Deployed** - Measures the total number of elements be deployed over time. The measurement is derived from the SCM data and gives us an idea of how many elements we are deploying. It falls under the heading of Velocity in measuring performance.
  - **Number of Fallbacks** - Measures how often we have to Fallback (recover) from a deployment. The measurement is derived from the SCM data and gives us an idea of the quality of our deployments. It could be an indication of poor testing before a production release. It falls under the heading of Quality in measuring performance.
  - **Number of Production Abends** - Measures how many Abends are occurring in Production over time. The measurement is derived from the Compuware Usage Data and gives us an idea of the Quality of our testing. It falls under the heading of Quality in measuring performance.
  - **Percentage of Time Spent on Innovation** - Measures how much time our developers are spending on Innovation versus how much time we are spending fixing bugs or doing routine maintenance.  The measurement is derived from the ITSM data by subtracing out everyhting that is not innovation (bugs or defects). The dea here is that the more time our developers spend innovating, the more innovation we can deliver to our customers.  It falls under the heading of Efficiency in measuring performance. 
