package org.asdtm.goodweather;

public class Weather
{
    public Temperature temperature = new Temperature();
    public Wind wind = new Wind();
    public CurrentWeather currentWeather = new CurrentWeather();
    public CurrentCondition currentCondition = new CurrentCondition();
    public Cloud cloud = new Cloud();

    public class Temperature
    {
        private float mTemp;

        public float getTemp()
        {
            return mTemp;
        }

        public void setTemp(float temp)
        {
            mTemp = temp;
        }
    }

    public class Wind
    {
        private float mSpeed;
        private float mDirection;

        public float getSpeed()
        {
            return mSpeed;
        }

        public void setSpeed(float speed)
        {
            mSpeed = speed;
        }

        public float getDirection()
        {
            return mDirection;
        }

        public void setDirection(float direction)
        {
            mDirection = direction;
        }
    }

    public class CurrentWeather
    {
        private String mDescription;
        private String mIdIcon;

        public String getDescription()
        {
            return mDescription;
        }

        public void setDescription(String description)
        {
            mDescription = description;
        }

        public String getIdIcon()
        {
            return mIdIcon;
        }

        public void setIdIcon(String idIcon)
        {
            mIdIcon = idIcon;
        }
    }

    public class CurrentCondition
    {
        private float mPressure;
        private int mHumidity;

        public float getPressure()
        {
            return mPressure;
        }

        public void setPressure(float pressure)
        {
            mPressure = pressure;
        }

        public int getHumidity()
        {
            return mHumidity;
        }

        public void setHumidity(int humidity)
        {
            mHumidity = humidity;
        }
    }

    public class Cloud
    {
        private int mClouds;

        public int getClouds()
        {
            return mClouds;
        }

        public void setClouds(int clouds)
        {
            mClouds = clouds;
        }
    }
}